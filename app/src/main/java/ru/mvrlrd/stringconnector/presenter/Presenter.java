package ru.mvrlrd.stringconnector.presenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.mvrlrd.stringconnector.model.Model;
import ru.mvrlrd.stringconnector.view.MainView;
@InjectViewState
public class Presenter extends MvpPresenter<MainView> {
    private Model model;

    public Presenter() {
        this.model = new Model();
    }

    public void onButtonPresenter(String s){
        model.setStringBuilderInModel(s); //имеет ли смысл менять stringBuilder в моделе?
        getViewState().setText(model.getUnitedText().toString());
    }
}
