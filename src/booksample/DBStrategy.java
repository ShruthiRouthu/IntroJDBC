/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksample;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Professional
 */
public interface DBStrategy {

    // Exception will be handled where the notifications are needed. Do validation too
    void openConnection(String driverClass, String url, String userName, String password) throws Exception;
    
    void closeConnection() throws SQLException;

    List<Map<String, Object>> findAllRecords(String tableName) throws SQLException;
    
    List<Map<String,Object>> findRecordsByCondition(String tableName, String condColName, Object condColVal)throws SQLException ;

    int emptyTable(String tableName) throws SQLException;
    
    int deleteRecordByID(String tableName,String pkName ,Object pkValue ) throws SQLException;
    
    int updateRecord(String tableName, String conditionColName , Object conditionColValue,
            List<String> keyList ,List<Object> valueList) throws SQLException;
    
    int insertRecord(String tableName,List<String> colNameList ,List<Object> colValueList) throws SQLException;
    
}
