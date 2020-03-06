package ru.mvrlrd.stringconnector.view;


import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainView extends MvpView {
    @StateStrategyType(value = AddToEndStrategy.class)
    void setText(String s);
}
