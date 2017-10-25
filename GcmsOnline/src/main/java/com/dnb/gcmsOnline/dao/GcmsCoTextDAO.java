package com.dnb.gcmsOnline.dao;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dnb.model.GcmsCoText;

@Repository
public class GcmsCoTextDAO {
	
	//@Autowired
   // private HibernateUtil hibernateUtil;
	@Autowired
 	private JdbcTemplate jdbcTemplate;
	
	
	public List<GcmsCoText> getAllGcmsCoText() {
/*		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();


    	  List<GcmsCoText> GcmsCoTextList = session.createQuery("from GcmsCoText").setFetchSize(10).list();
    	 session.close();
    	  return GcmsCoTextList;*/
		return null;

	}
	
	public List<GcmsCoText> getGcmsCoTextById(Long duns) {
		/*SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  List<GcmsCoText> gcmsCoTextList =  session.createCriteria(GcmsCoText.class)
				  .add(Restrictions.eq("id.gcmsDuns", BigDecimal.valueOf(duns))).list();    	 
  
    	  session.close();
    	  return gcmsCoTextList;*/
		
		System.out.println(jdbcTemplate);
		List<GcmsCoText> result = jdbcTemplate.query(
                "SELECT GCMS_COMPANY_ID, GCMS_FILE_NAME, GCMS_TEXT_DATA FROM GLOBALCMS.Gcms_CO_Text where GCMS_COMPANY_ID = ?",
                (rs, rowNum) -> new GcmsCoText(rs.getBigDecimal("GCMS_COMPANY_ID"),
                        rs.getString("GCMS_FILE_NAME"), rs.getClob("GCMS_TEXT_DATA")),duns);
        return result;
       

	}

	
}
