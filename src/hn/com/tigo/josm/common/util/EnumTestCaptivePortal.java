package hn.com.tigo.josm.common.util;

public enum EnumTestCaptivePortal {
	/** Constant that defines P_JOSM_JPA. */
	P_JOSM_ACL_POLICY_JPA("CAPTIVE_PORTAL_DS", EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA),

	/** Constant that defines P_JOSM_JPA_JTA_MANAGED. */
	P_JOSM_ACL_POLICY_JPA_JTA_MANAGED("CAPTIVE_PORTAL_DS.JtaManaged",
			EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA_JTA_MANAGED),

	/** Constant that defines P_JOSM_JPA_USER_NAME. */
	P_JOSM_ACL_POLICY_JPA_USER_NAME("CAPTIVE_PORTAL_DS.UserName", EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA_USER_NAME),

	/** Constant that defines P_JOSM_JPA_PASSWORD. */
	P_JOSM_ACL_POLICY_JPA_PASSWORD("CAPTIVE_PORTAL_DS.Password", EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA_PASSWORD),

	/** Constant that defines P_JOSM_JPA_JDBC_URL. */
	P_JOSM_ACL_POLICY_JPA_JDBC_URL("CAPTIVE_PORTAL_DS.JdbcUrl", EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA_JDBC_URL),

	/** Constant that defines P_JOSM_JPA_JDBC_DRIVER. */
	P_JOSM_ACL_POLICY_JPA_JDBC_DRIVER("CAPTIVE_PORTAL_DS.JdbcDriver",
			EnumTestCaptivePortal.C_P_JOSM_ACL_POLICY_JPA_JDBC_DRIVER),
			
	/** Attribute that determine P_OPENEJB_EMBEDDED_REMOTABLE. */
	P_OPENEJB_EMBEDDED_REMOTABLE("openejb.embedded.remotable", "true"),
	
	/** Attribute that determine P_OPENEJB_LOCALCOPY. */
	P_OPENEJB_LOCALCOPY("openejb.localcopy", "false");

	/* /** Attribute that determine action. */
	/** Attribute that determine _key. */
	private String _key;

	/* /** Attribute that determine action. */

	/** Attribute that determine _value. */
	private String _value;

	/** Constant that defines C_P_JOSM_JPA. */
	private static final String C_P_JOSM_ACL_POLICY_JPA = "new://Resource?type=DataSource";

	/** Constant that defines C_P_JOSM_JPA_JTA_MANAGED. */
	private static final String C_P_JOSM_ACL_POLICY_JPA_JTA_MANAGED = "true";

	/** Constant that defines C_P_JOSM_JPA_USER_NAME. */
	private static final String C_P_JOSM_ACL_POLICY_JPA_USER_NAME = "CAPTIVE_PORTAL";

	/** Constant that defines C_P_JOSM_JPA_PASSWORD. */
	private static final String C_P_JOSM_ACL_POLICY_JPA_PASSWORD = "Celtel2009";

	/** Constant that defines C_P_JOSM_JPA_JDBC_URL. */
	private static final String C_P_JOSM_ACL_POLICY_JPA_JDBC_URL = "jdbc:oracle:thin:@//192.168.160.10:1522/set1dbSHARED.celtel.net";

	/** Constant that defines C_P_JOSM_JPA_JDBC_DRIVER. */
	private static final String C_P_JOSM_ACL_POLICY_JPA_JDBC_DRIVER = "oracle.jdbc.OracleDriver";

	/**
	 * Instantiates a new enum action.
	 *
	 * @param key the key
	 * @param value the value
	 */
	private EnumTestCaptivePortal(final String key, final String value) {
		this._key = key;
		this._value = value;
	}

	/**
	 * Gets the action.
	 * 
	 * @return the action
	 */
	public String getKey() {
		return this._key;
	}

	/**
	 * Gets the action.
	 * 
	 * @return the action
	 */
	public String getValue() {
		return this._value;
	}


}
