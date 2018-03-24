package com.example.quickstart;

/**
 * Created by Eric on 3/24/2018.
 * statistics class
 * attributes: email , total_points, time_on_phone,time_off_phone,percent_class_time_wasted,total_cpoints
 *
 */

public class statistics {
    String _email;
    int _total_points;
    int _time_on_phone;
    int _time_off_phone;
    int _percent_of_class_wasted;
    int _total_cpoints;
    //all params
    public statistics(String _email, int _total_points,int _time_on_phone,int _time_off_phone,int _percent_of_class_wasted,int _total_cpoints){
        this._email = _email;
        this._total_points=_total_points ;
        this._time_on_phone= _time_on_phone;
        this._time_off_phone = _time_off_phone;
        this._percent_of_class_wasted = _percent_of_class_wasted;
        this._total_cpoints = _total_cpoints;
    }

    public statistics(int _total_points, int _time_on_phone,int _time_off_phone,int _percent_of_class_wasted,int _total_cpoints){
        this._total_points = _total_points;
        this._time_on_phone = _time_on_phone;
        this._time_off_phone = _time_off_phone;
        this._percent_of_class_wasted = _percent_of_class_wasted;
        this._total_cpoints = _total_cpoints;
    }

    public String get_email(){
        return _email;
    }

    public int get_total_points() {
        return _total_points;
    }

    public int get_time_on_phone() {
        return _time_on_phone;
    }

    public int get_time_off_phone() {
        return _time_off_phone;
    }

    public void set_percent_of_class_wasted(int _percent_of_class_wasted) {
        this._percent_of_class_wasted = _percent_of_class_wasted;
    }

    public void set_total_cpoints(int _total_cpoints) {
        this._total_cpoints = _total_cpoints;
    }

}
