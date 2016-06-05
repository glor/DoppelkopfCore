package dokoCore.Interfaces;

public abstract interface Constants {
	public static final int PLAYERS_MAX = 48;
	
	public static final int CARDS_MAX = 48;
	public static final int CARDS_PER_PLAYER = 12;
	
	public static final int TEAM_RE = 0;
	public static final int TEAM_KONTRA = 1;
	
	public static final int CARD_INVALID = -1;
	public static final int CARD_NONE = -2;
	public static final int CARD_GESUND = -3;
	public static final int CARD_VORBEHALT = -4;
	
	public static final int CARD_MODUS_HOCHZEIT = -5;
	public static final int CARD_MODUS_ARMUT = -6;
	public static final int CARD_MODUS_SOLO = -7;
	public static final int CARD_MODUS_SOLO_KREUZ = -8;
	public static final int CARD_MODUS_SOLO_PIK = -9;
	public static final int CARD_MODUS_SOLO_HERZ = -10;
	public static final int CARD_MODUS_SOLO_KARO = -11;
	public static final int CARD_MODUS_SOLO_DAMEN = -12;
	public static final int CARD_MODUS_SOLO_BUBEN = -13;
	public static final int CARD_MODUS_SOLO_ASS = -14;
	
	public static final int CARD_ANSAGE_RE = -18;
	public static final int CARD_ANSAGE_KONTRA = -19;
	public static final int CARD_ANSAGE_U9 = -20;
	public static final int CARD_ANSAGE_U6 = -21;
	public static final int CARD_ANSAGE_U3 = -22;
	public static final int CARD_ANSAGE_SCHWARZ = -23;
	
	// there is a Sau
	public static final int RULE_SAU_ENABLE = 0;
	// the first Ace is the Sau == false : second Ace is the Sau == true
	public static final int RULE_SAU_FIRST = 1;
	// 2. Herz10 schlägt 1. im letztem Stich
	public static final int RULE_HERZ10 = 2;
	// Gemschern: bis die Teams feststehen (ansage+kreuz dame), mit karo könig gestochen -> teams aussuchen
	public static final int RULE_GEMSCHER = 3;
	// 9 sind erlaubt
	public static final int RULE_MIT_9 = 4;
	// karlchen im letzten stich
	public static final int RULE_KARLCHEN = 5;
	
	public static final int RULE_NOT_KARLCHEN_KARO_DAME_ONLY = 6;
	
	public static final int RULE_ARMUT = 7;
	// true ? (3 Trumpf || 4 Trumpf, wenn Fuchs) : 3 Trumpf
	public static final int RULE_ARMUT_VARIANTE = 8;
	// 5 9er
	public static final int RULE_SCHMEISSEN_5_9ER = 9;
	// <= 2 Trumpf 
	public static final int RULE_SCHMEISSEN_2TRUMPF = 10;
	// no trump > karo Ace
	public static final int RULE_SCHMEISSEN_KLEINER_KARO_ASS = 11;
	// Doppelköpfe in Soli möglich
	public static final int RULE_DOPPELKOPF_SOLI = 12;
	
}
