package ru.mvrlrd.stringconnector.presenter;

import ru.mvrlrd.stringconnector.model.Model;
import ru.mvrlrd.stringconnector.view.MainActivity;
import ru.mvrlrd.stringconnector.view.MainView;

public class Presenter {
    private MainView activity;
    private Model model;

    public Presenter(MainActivity activity) {
        this.activity = activity;
        this.model = new Model();
    }

    public void addTextToStringBuilderFromModel(String s){
        model.getUnitedText().append(s);
    }

    public void onButtonPresenter(String s){
        addTextToStringBuilderFromModel(s); //имеет ли смысл менять stringBuilder в моделе?
        activity.setText(model.getUnitedText().toString());
    }


}
