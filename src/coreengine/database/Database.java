package coreengine.database;

import java.util.ArrayList;
import java.util.List;

import coreengine.table.Table;

public class Database {
    public String databaseName;
    List<Table> allTables;

    public Database(String databaseName){
        this.databaseName = databaseName;
        this.allTables = new ArrayList<>();
    }

    public void createTable(String tableName){
        Table newTable = new Table(tableName);
        allTables.add(newTable);
    }

    public void showAllTables(){
        for(Table tb : allTables) System.out.println(tb.tableName);
    }

    public void truncateTable(){

    }

    public void deleteTable(){

    }

    public void updateTableName(){

    }
}
