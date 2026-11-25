package coreengine;

import coreengine.database.Database;

import java.util.ArrayList;
import java.util.List;

public class DatabaseEngine {

    private List<Database> allDatabases;
    private Database currentDatabase;

    public DatabaseEngine(){
        this.allDatabases = new ArrayList<>();
        this.currentDatabase = null;
    }

    String createDatabase(String databaseName){
        Database newDB = new Database(databaseName);
        allDatabases.add(newDB);
        return "Database \""+databaseName+"\" created";
    }

    void setCurrentDatabase(Database database){
        this.currentDatabase = database;
    }

    String deleteDatabase(){
        if(currentDatabase == null) return "Only current Database can be deleted";
        else{
            allDatabases.remove(currentDatabase);
            return "Database deleted";
        }
    }

    void showAllDatabases(){
        for(Database db : allDatabases) System.out.println(db.databaseName);
    }
 }
