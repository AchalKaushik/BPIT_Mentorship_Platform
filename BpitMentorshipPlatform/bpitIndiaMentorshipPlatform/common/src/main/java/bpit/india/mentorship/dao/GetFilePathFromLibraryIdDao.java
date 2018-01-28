package bpit.india.mentorship.dao;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.LibraryOperationsConfig;

@Repository
public class GetFilePathFromLibraryIdDao extends AbstractDao {
 private static final Logger LOGGER = LoggerFactory.getLogger(GetFilePathFromLibraryIdDao.class);

 @Autowired
 private LibraryOperationsConfig libraryOperationsConfig;

 public String getFilePathFromLibraryIdDao(String libraryId) {
  try {
   LOGGER.debug("inside try block");
   LOGGER.debug("creating the hashmap");
   Map < String, String > parameters = new HashMap < String, String > ();
   LOGGER.debug("hashmap successfully created");
   parameters.put("libraryId", libraryId);
   LOGGER.debug("got the library id");
   return getJdbcTemplate().queryForObject(libraryOperationsConfig.getGetFilePathFromLibraryId(), parameters, String.class);
  } catch (Exception e) {
   LOGGER.error("An exception occurred while getting file path from DB corresponding to libraryid " + e);
   /*
    * An exception occurred while getting file path from DB 
    * corresponding to libraryId
    */
   e.printStackTrace();
   return null;
  }

 }
}