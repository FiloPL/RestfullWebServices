package ttsw.filopl.restfullwebservices.versioning;

/**
 * Created by T. Filo Zegarlicki on 10.06.2022
 **/

public class PersonY {
    private Name name;

    public PersonY() {
        super();
    }

    public PersonY(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
