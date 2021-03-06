package <%= appPackage %>.weather.di.module;

import android.arch.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import <%= appPackage %>.di.scope.ViewModelScope;
import <%= appPackage %>.weather.mvvm.viewmodel.WeatherDailyViewModel;

/**
 * @author xiaobailong24
 * @date 2017/8/14
 * MVVM WeatherDailyViewModelModule
 */
@Module
public abstract class WeatherDailyViewModelModule {

    @Binds
    @IntoMap
    @ViewModelScope(WeatherDailyViewModel.class)
    abstract ViewModel bindWeatherDailyViewModel(WeatherDailyViewModel weatherDailyViewModel);
}
