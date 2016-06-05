package dokoCore.Essentials;

abstract class Rules {
	static {
		for(rule:ruleset) {
			rule = false;
		}
	}
	private static boolean[] ruleset = new boolean[13];
	static void enable(int rule) {
		if(rule > ruleset.length || rule < 0)
			throw new IllegalArgumentException("This rule does not exist");
		ruleset[rule] = true;
	}
	static void disable(int rule) {
		if(rule > ruleset.length || rule < 0)
			throw new IllegalArgumentException("This rule does not exist");
		ruleset[rule] = false;
	}
	static boolean getRule(int rule) {
		if(rule > ruleset.length || rule < 0)
			throw new IllegalArgumentException("This rule does not exist");
		return ruleset[rule];
	}
}
