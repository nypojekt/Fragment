package com.nick.android.fragmentdynamic;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;



import android.widget.CheckBox;

public class MainActivity extends Activity {

    Fragment frag1;
    Fragment frag2;
    FragmentTransaction fTrans;
    CheckBox chbStack;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new Fragment();
        frag2 = new Fragment();

        chbStack = (CheckBox) findViewById(R.id.chbStack);

        fTrans = getFragmentManager().beginTransaction();
        fTrans.replace(R.id.frgmCont, frag1);
        fTrans.commit();



    }





//    public void onClick(View v) {
//        fTrans = getFragmentManager().beginTransaction();
//        switch (v.getId()) {
//            case R.id.btnAdd:
//                fTrans.add(R.id.frgmCont, frag1);
//                break;
//            case R.id.btnRemove:
//                fTrans.remove(frag1);
//                break;
//            case R.id.btnReplace:
//                fTrans.replace(R.id.frgmCont, frag2);
//            default:
//                break;
//        }
//        if (chbStack.isChecked()) fTrans.addToBackStack(null);
//        fTrans.commit();
//    }

}
