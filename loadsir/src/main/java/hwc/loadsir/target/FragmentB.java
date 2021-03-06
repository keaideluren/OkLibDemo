package hwc.loadsir.target;

import android.view.View;
import android.widget.Toast;

import hwc.loadsir.PostUtil;
import hwc.loadsir.R;
import hwc.loadsir.base.BaseFragment;
import hwc.loadsir.callback.EmptyCallback;
import hwc.loadsir.callback.LoadingCallback;


/**
 * Description:TODO
 * Create Time:2017/9/5 13:27
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class FragmentB extends BaseFragment {

    @Override
    protected int onCreateFragmentView() {
        return R.layout.fragment_b_content;
    }

    @Override
    protected void loadNet() {
        // do net here...
        // call back
        PostUtil.postCallbackDelayed(mBaseLoadService, EmptyCallback.class);
    }
    @Override
    protected void onNetReload(View v) {
        Toast.makeText(getContext(),"reload in Fragment B",Toast.LENGTH_SHORT).show();
        mBaseLoadService.showCallback(LoadingCallback.class);
        //do retry logic...

        //callback
        PostUtil.postSuccessDelayed(mBaseLoadService);
    }
}