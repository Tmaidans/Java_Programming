package officeHours.officeHoursWeek12Tasks.app;

/*
App [inheritance, constructors]

    Create an App class

        - create variables:
            name (app name), version

        - create a constructor to initialize the variables

        - create method:
            download()
                Example output: prints $name is downloading version $version
 */

public class App {

    public String name;
    public int version;

    public App(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }
}
