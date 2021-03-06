package kr.hs.emirim.joseoyoung.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radio_cat, radio_dog, radio_gosum;
    Button butOk;
    ImageView imgvPet;
    TextView textQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView)findViewById(R.id.text_quest);
        rg = (RadioGroup) findViewById(R.id.rg);
        radio_dog=(RadioButton) findViewById(R.id.radio_dog);
        radio_cat=(RadioButton) findViewById(R.id.radio_cat);
        radio_gosum=(RadioButton) findViewById(R.id.radio_gosum);
        butOk=(Button) findViewById(R.id.but_ok);
        imgvPet=(ImageView) findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);
    }//end onCreate

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()) {
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.radio_dog:
                imgvPet.setImageResource(R.drawable.huski);
                break;
            case R.id.radio_cat:
                imgvPet.setImageResource(R.drawable.pold);
                break;
            case R.id.radio_gosum:
                imgvPet.setImageResource(R.drawable.gosum);
                break;
            default:
                Toast.makeText(this, "라디오 버튼이 선택이 안 되었습니다.",Toast.LENGTH_SHORT).show();
        }
    }
}