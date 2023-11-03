package bible2;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
	/// main function
	public static void main(String[] args) {
		ArrayList<HumanGroup> disciples = new ArrayList<HumanGroup>();
		HumanGroup firstDisciples = new HumanGroup();
		long totalPopulation = 7-700-000-000L;
		
		///
		firstDisciples.Age = 30;
		firstDisciples.Population = 13;
		firstDisciples.IsDisciple = true;
		disciples.add(firstDisciples);
		long christianPopulation = 13L;
		
		ArrayList<HumanGroup> nonBelievers = new ArrayList<HumanGroup>();
		HumanGroup otherHuman = new HumanGroup();
		otherHuman.Age = 18;
		otherHuman.Population = totalPopulation - christianPopulation;
		nonBelievers.add(otherHuman);
		ArrayList<HumanGroup> apprentices = new ArrayList<HumanGroup>();
		long totalNewApprentice;
		
		/// starting at beginning
		int year = 0;
		while (christianPopulation < totalPopulation && !nonBelievers.isEmpty() && !disciples.isEmpty()) {
			// remove who will die at this time
			Iterator<HumanGroup> discipleIt = disciples.iterator();
			while(discipleIt.hasNext()) {
				HumanGroup curr = discipleIt.next();
				if (curr.Age >= Human.MaxAge) {
					discipleIt.remove();
				}
			}
			Iterator<HumanGroup> apprenticeIt = apprentices.iterator();
			while(apprenticeIt.hasNext()) {
				HumanGroup curr = apprenticeIt.next();
				if (curr.Age >= Human.MaxAge) {
					apprenticeIt.remove();
				}
			}
			Iterator<HumanGroup> nonBelieverIt = nonBelievers.iterator();
			while(nonBelieverIt.hasNext()) {
				HumanGroup curr = nonBelieverIt.next();
				if (curr.Age >= Human.MaxAge) {
					nonBelieverIt.remove();
				}
			}
			/// check for new babies
			long totalBaby = 0;
			for(HumanGroup g: disciples) {
				if (g.Age == Human.AgeOfGivingBirth && year > 0) {
					totalBaby += g.Population;
				}
			}
			for(HumanGroup g: apprentices) {
				if (g.Age == Human.AgeOfGivingBirth) {
					totalBaby += g.Population;
				}
			}
			for(HumanGroup g: nonBelievers) {
				if (g.Age == Human.AgeOfGivingBirth) {
					totalBaby += g.Population;
				}
			}
			if (totalBaby > 0) {
				HumanGroup baby = new HumanGroup();
				baby.Population = totalBaby;
				nonBelievers.add(baby);
			}
			
			// check transformation from nonbeliever to believer
			totalNewApprentice = 0;
			nonBelieverIt = nonBelievers.iterator();
			while(nonBelieverIt.hasNext() && totalNewApprentice > 0) {
				HumanGroup curr = nonBelieverIt.next();
				if (curr.Age >= Human.AgeAsApprentice) {
					HumanGroup newApprentice = curr.Clone();
					newApprentice.IsApprentice = true;
					if (curr.Population <= totalNewApprentice) {
						nonBelieverIt.remove();
						totalNewApprentice -= curr.Population;
					} else {
						curr.Population -= totalNewApprentice;
						newApprentice.Population = totalNewApprentice;
						totalNewApprentice = 0;
					}
					apprentices.add(newApprentice);
				}
			}
			
			// aging
			for(HumanGroup hg: disciples) {
				hg.Aging();
				if (hg.YearsInTeaching >= Human.YearToBeDisciple) {
					hg.YearsInTeaching = 0;
				}
			}
			
			apprenticeIt = apprentices.iterator();
			while(apprenticeIt.hasNext()) {
				HumanGroup curr = apprenticeIt.next();
				curr.Aging();
				if (curr.YearsAsApprentice == Human.YearToBeDisciple) {
					curr.YearsAsApprentice = 0;
					curr.IsApprentice = false;
					curr.IsDisciple = true;
					apprenticeIt.remove();
					disciples.add(curr);
				}
			}
			
			for(HumanGroup hg: nonBelievers) {
				hg.Aging();
			}
			totalPopulation = getPopulation(disciples, nonBelievers, apprentices);
			christianPopulation = getPopulation(disciples);
			year++;
			try {
			    Thread.sleep(100);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			System.out.println("Year " + (2023 + year) + ": Christian population is: " + christianPopulation + ", and total population is "
					+ totalPopulation +". Christians account for " + String.format("%.2f", (((float)christianPopulation / totalPopulation)*100)) + "%."); 
		}
	}
	
	// get population function
	public static long getPopulation(ArrayList<HumanGroup> dis, ArrayList<HumanGroup> non,
			ArrayList<HumanGroup> app) {
				long total = 0;
				for(HumanGroup h: dis) {
					total += h.Population;
				}
				for(HumanGroup h: non) {
					total += h.Population;
				}
				for(HumanGroup h: app) {
					total += h.Population;
				}
				return total;
			}
			
			public static long getPopulation(ArrayList<HumanGroup> dis) {
				long total = 0;
				for(HumanGroup h: dis) {
					total += h.Population;
				}
				return total;
			}

}