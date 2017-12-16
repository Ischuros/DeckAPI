package example.snap;

import card.event.EmptyEvent;
import play.Play;

public class SnapPlay extends Play<EmptyEvent<SnapGame>, EmptyEvent<SnapGame>, SnapGame> {

    @Override
    protected boolean isAllowToRun(SnapGame context) {
        return true;
    }

    @Override
    protected void runInternal(SnapGame context) {
        //TODO
    }
}
