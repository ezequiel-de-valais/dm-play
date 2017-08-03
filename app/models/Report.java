package models;

import play.Logger;

public class Report {

    String name;
    Integer time;

    public Report(String name, Integer time) {
        this.name = name;
        this.time = time;
    }

    public void execute() {
        long start = System.currentTimeMillis();
        Logger.info("starting intensive " + name + " report at " + start);
        try {
            Thread.sleep(time);
            
        } catch (Exception e) {
        }
        Logger.info("done with intensive " + name + " report ");
        Logger.info("took "
                + ((System.currentTimeMillis() - start) / 1000) + "s");
    }

    public String toString() {
        return name;
    }
}
