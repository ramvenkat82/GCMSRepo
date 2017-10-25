package com.dnb.gcmsOnline.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dnb.model.GcmsTextTypes;

@Repository
public class GcmsTextTypesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// Prod Database credentials
	static final String USER = "GLOBALCMS_RO";
	static final String PASS = "gcmsr0";
	static final String DB_URL = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS=(PROTOCOL=TCP)(HOST=hpbc5b14.hoovers.com)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=hpbc10b7.hoovers.com)(PORT=1521))(LOAD_BALANCE=yes)(CONNECT_DATA=(SERVICE_NAME = STGZERO)))";
	static final String DB_URL_REPORT = "jdbc:oracle:thin:@c0ospr002.hoovers.com:1521/report0";

	public List<GcmsTextTypes> getAllGcmsTextTypes() {
		/*
		 * SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		 * Session session = sessionFactory.openSession();
		 * 
		 * 
		 * List<GcmsTextTypes> GcmsTextTypesList =
		 * session.createQuery("from GcmsTextTypes").list(); session.close();
		 * return GcmsTextTypesList;
		 */
		System.out.println(jdbcTemplate);
//		List<GcmsTextTypes> result = jdbcTemplate
//				.query("SELECT GCMS_TEXT_TYPE_ID, GCMS_TEXT_TYPE_NAME, GCMS_TEXT_TYPE_DESCRIPTION FROM GLOBALCMS.Gcms_Text_Types",
//						(rs, rowNum) -> new GcmsTextTypes(rs
//								.getBigDecimal("GCMS_TEXT_TYPE_ID"), rs
//								.getString("GCMS_TEXT_TYPE_NAME"), rs
//								.getString("GCMS_TEXT_TYPE_DESCRIPTION")));

		Connection conn = null;
		Statement stmt = null;

		List<GcmsTextTypes> arrayListGCMSTextTypes = null;
		try {
			// STEP 2: Register JDBC driver
			// Class.forName("oracle.jdbc.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement....");
			stmt = conn.createStatement();
			stmt.setFetchSize(500);
			String sql;
			sql = "SELECT GCMS_TEXT_TYPE_ID, GCMS_TEXT_TYPE_NAME, GCMS_TEXT_TYPE_DESCRIPTION FROM GLOBALCMS.Gcms_Text_Types";
			ResultSet rs = stmt.executeQuery(sql);
			arrayListGCMSTextTypes = new ArrayList<GcmsTextTypes>();
			while (rs.next()) {
				GcmsTextTypes gcmsTextType = new GcmsTextTypes();
				gcmsTextType.setGcmsTextTypeId(rs.getBigDecimal("GCMS_TEXT_TYPE_ID"));
				gcmsTextType.setGcmsTextTypeName(rs.getString("GCMS_TEXT_TYPE_NAME"));
				gcmsTextType.setGcmsTextTypeDescription(rs.getString("GCMS_TEXT_TYPE_DESCRIPTION"));
				arrayListGCMSTextTypes.add(gcmsTextType);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try

		System.out.println("Goodbyeee!");
		// List<GcmsTextTypes> result = jdbcTemplate.query(
		// "SELECT ID, NAME, SHORT_NAME FROM country",
		// (rs, rowNum) -> new GcmsTextTypes(rs.getBigDecimal("ID"),
		// rs.getString("NAME"), rs.getString("SHORT_NAME")));
		return arrayListGCMSTextTypes;
	}

	public GcmsTextTypes getAllGcmsTextTypesHardcoded() {
		GcmsTextTypes gcmsTextTypes = new GcmsTextTypes();
		gcmsTextTypes.setGcmsTextTypeId(BigDecimal.ONE);
		gcmsTextTypes.setGcmsTextTypeName("cognizant");
		gcmsTextTypes.setGcmsTextTypeDescription("description");
		// List<GcmsTextTypes> employeeList =
		// session.createQuery("from gcmsTextTypes").list();
		return gcmsTextTypes;
	}

}
