package de.dc.swtform.designer.util

import java.util.List
import java.util.Random

class Dummy {
	public static List<String> names = #[
			'James T. Kirk',
			'Neo Anderson',
			'Morphois',
			'Thomas Müller',
			'Bastian Schweinsteiger',
			'Mevlo de Honor',
			'Tom Wlaschiha',
			'Luna Blaise',
			'Lennon Stella',
			'Jennyfer Jewell',
			'Milos Vukovic',
			'Peter Jackson',
			'James Bond',
			'Jason Bourne',
			'Tony Stark',
			'Clark Kent',
			'Bruce Wayne',
			'Barry Allen',
			'Sabine Oberhorner'
	]
	
	static Random random = new Random
	
	def static String getRandomString(){
		val index = random.nextInt(names.size)
        return names.get(index)
	}
	
	def static int getRandomInt(int bounds){
		random.nextInt(bounds)
	}
	
	def static double getRandomDouble(){
		random.nextDouble;
	}
}
