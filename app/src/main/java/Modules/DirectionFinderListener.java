package Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import Modules.Route;

/**
 * Created by Chirag  Singhvi on 04-Jul-17.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
