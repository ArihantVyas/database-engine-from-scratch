package coreengine.table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public String tableName;
    public List<Column> columns;
    public List<Row> rows;
    int columnCount;

    public Table(String tableName){
        this.tableName = tableName;
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
        this.columnCount = 0;
    }
}
