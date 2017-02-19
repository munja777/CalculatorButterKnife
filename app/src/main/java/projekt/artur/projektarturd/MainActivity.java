package projekt.artur.projektarturd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    public Logic logic = new Logic();

    @BindView(R.id.textView) TextView textView;
    @BindView(R.id.textViewS) TextView textViewS;
    @BindView(R.id.btnOne) Button btnOne;
    @BindView(R.id.btnTwo) Button btnTwo;
    @BindView(R.id.btnThree) Button btnThree;
    @BindView(R.id.btnFour) Button btnFour;
    @BindView(R.id.btnFive) Button btnFive;
    @BindView(R.id.btnSix) Button btnSix;
    @BindView(R.id.btnSeven) Button btnSeven;
    @BindView(R.id.btnEight) Button btnEight;
    @BindView(R.id.btnNine) Button btnNine;
    @BindView(R.id.btnZero) Button btnZero;
    @BindView(R.id.btnPlus) Button btnPlus;
    @BindView(R.id.btnMinus) Button btnMinus;
    @BindView(R.id.btnMulti) Button btnMulti;
    @BindView(R.id.btnDivide) Button btnDivide;
    @BindView(R.id.btnDot) Button btnDot;
    @BindView(R.id.btnClear) Button btnClear;
    @BindView(R.id.btnEqual) Button btnEqual;

    @OnClick(R.id.btnOne) public void btnOne() { logic.number(btnOne, textView, textViewS); }
    @OnClick(R.id.btnTwo) public void btnTwo() { logic.number(btnTwo, textView, textViewS); }
    @OnClick(R.id.btnThree) public void btnThree() { logic.number(btnThree, textView, textViewS); }
    @OnClick(R.id.btnFour) public void btnFour() { logic.number(btnFour, textView, textViewS); }
    @OnClick(R.id.btnFive) public void btnFive() { logic.number(btnFive, textView, textViewS); }
    @OnClick(R.id.btnSix) public void btnSix() { logic.number(btnSix, textView, textViewS); }
    @OnClick(R.id.btnSeven) public void btnSeven() { logic.number(btnSeven, textView, textViewS); }
    @OnClick(R.id.btnEight) public void btnEight() { logic.number(btnEight, textView, textViewS); }
    @OnClick(R.id.btnNine) public void btnNine() { logic.number(btnNine, textView, textViewS); }

    @OnClick(R.id.btnPlus) public void btnPlus() { logic.body (btnPlus, 1, textView, textViewS, btnMinus); }
    @OnClick(R.id.btnMinus) public void btnMinus() { logic.body (btnMinus, 2, textView, textViewS, btnMinus); }
    @OnClick(R.id.btnMulti) public void btnMulti() { logic.body (btnMulti, 3, textView, textViewS, btnMinus); }
    @OnClick(R.id.btnDivide) public void btnDivide() { logic.body (btnDivide, 4, textView, textViewS, btnMinus); }

    @OnClick(R.id.btnZero) public void btnZero() { logic.zeroO(btnZero, textView, textViewS); }
    @OnClick(R.id.btnClear) public void btnClear() { logic.clear(textView, textViewS); }
    @OnClick(R.id.btnEqual) public void btnEqual() { logic.equalL(textView, textViewS); }
    @OnClick(R.id.btnDot) public void btnDot() { logic.btnDotT(textView, textViewS); }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


}
