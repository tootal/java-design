package mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
    private static final long serialVersionUID = 1L;
    public ColleagueButton(String caption) {
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) {
    }
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
