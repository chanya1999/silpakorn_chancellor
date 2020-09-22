package th.su.homwork.silpakornchancello;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import th.su.homwork.silpakornchancello.model.ChancellorItem;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_main);

            //Create Adapter object
            th.su.homwork.silpakornchancello.MyAdapter adapter = new th.su.homwork.silpakornchancello.MyAdapter();
            //Create layout manager
            LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
            RecyclerView rv = findViewById(R.id.chancellor_recycler_view);
            rv.setLayoutManager(lm);
            rv.setAdapter(adapter);
        }


    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "กดซ้ำอีกครั้งเพื่อออก", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


    }


    class MyAdapter extends RecyclerView.Adapter<th.su.homwork.silpakornchancello.MyAdapter.MyViewHolder> {


        ChancellorItem[] items = {
                new ChancellorItem(R.drawable.a_sil_peerasri,"1. ศาสตราจารย์ ศิลป์ พีระศรี","ผู้อำนวยการ","พ.ศ. 2476 - พ.ศ. 2486"),
                new ChancellorItem(R.drawable.b_praya_anuman,"2. ศาสตราจารย์ พระยาอนุมานราชธน","ผู้อำนวยการ","พ.ศ. 2486 - พ.ศ. 2492"),
                new ChancellorItem(R.drawable.c_panupan,"3. ศาสตราจารย์ พลตรี พระเจ้าวรวงศ์เธอ พระองค์เจ้าภาณุพันธุ์ยุคล","ผู้อำนวยการ","พ.ศ. 2492 - พ.ศ. 2494"),
                new ChancellorItem(R.drawable.d_ronnasitpichai01,"4. ศาสตราจารย์ พลเอก หลวงรณสิทธิพิชัย","ผู้อำนวยการ","พ.ศ. 2494 - พ.ศ. 2501"),
                new ChancellorItem(R.drawable.e_thanit,"5. ศาสตราจารย์ ธนิต อยู่โพธิ์","ผู้อำนวยการ","พ.ศ. 2501 - พ.ศ. 2508"),
                new ChancellorItem(R.drawable.f_ml_pin,"6. ศาสตราจารย์ หม่อมหลวงปิ่น มาลากุล","อธิการบดี","พ.ศ. 2508 - พ.ศ. 2514"),
                new ChancellorItem(R.drawable.g_mj_yajai,"7. ศาสตราจารย์ พันเอก หม่อมเจ้ายาใจ จิตรพงศ์","อธิการบดี","พ.ศ. 2514 - พ.ศ. 2517"),
                new ChancellorItem(R.drawable.h_sawang,"8. ศาสตราจารย์ แสวง สดประเสริฐ","รักษาการแทนอธิการบดี","พ.ศ. 2517 - พ.ศ. 2518"),
                new ChancellorItem(R.drawable.i_ardun,"9. ศาสตราจารย์ ดร.อดุล วิเชียรเจริญ","อธิการบดี","พ.ศ. 2518 - พ.ศ. 2522"),
                new ChancellorItem(R.drawable.j_tongyai,"10. ศาสตราจารย์ พลตรี หม่อมราชวงศ์ทองใหญ่ ทองใหญ่","อธิการบดี","พ.ศ. 2522 - พ.ศ. 2525"),
                new ChancellorItem(R.drawable.k_supataradit,"11. ศาสตราจารย์ หม่อมเจ้าสุภัทรดิศ ดิศกุล","อธิการบดี","พ.ศ. 2525 - พ.ศ. 2529"),
                new ChancellorItem(R.drawable.l_arnak,"12. ผู้ช่วยศาสตราจารย์ เอนก วีรเวชชพิสัย","อธิการบดี","พ.ศ. 2529 - พ.ศ. 2531"),
                new ChancellorItem(R.drawable.m_kaisree,"13. ศาสตราจารย์เกียรติคุณ คุณหญิง ไขศรี ศรีอรุณ","อธิการบดี","พ.ศ. 2531 - พ.ศ. 2539"),
                new ChancellorItem(R.drawable.n_tongjai,"14. ศาสตราจารย์เกียรติคุณ ดร.ตรึงใจ บูรณสมภพ","อธิการบดี","พ.ศ. พ.ศ. 2539 - พ.ศ. 2543"),
                new ChancellorItem(R.drawable.o_put,"15. อาจารย์ พุฒ วีระประเสริฐ","อธิการบดี","พ.ศ. 2543 - พ.ศ. 2547"),
                new ChancellorItem(R.drawable.p_wichaiwat,"16. รองศาสตราจารย์ ดร.วิวัฒน์ชัย อัตถากร","อธิการบดี","พ.ศ. 2547 - พ.ศ. 2550"),
                new ChancellorItem(R.drawable.q_paradaj02,"17. นายภราเดช พยัฆวิเชียร","อธิการบดี","พ.ศ. 2550 - พ.ศ. 2551"),
                new ChancellorItem(R.drawable.r_authai,"18. ดร.อุทัย ดุลยเกษม","อธิการบดี","พ.ศ. 2551 - พ.ศ. 2555"),
                new ChancellorItem(R.drawable.s_chaichan,"19. ผู้ช่วยศาสตราจารย์ ชัยชาญ ถาวรเวช","อธิการบดี","พ.ศ. 2556 - พ.ศ. 2560"),
                new ChancellorItem(R.drawable.t_wanchai,"20. ผู้ช่วยศาสตราจารย์ ดร.วันชัย สุทธะนันท์","อธิการบดี","พ.ศ. 2560 - พ.ศ. 2561"),
                new ChancellorItem(R.drawable.s_chaichan,"21. ผู้ช่วยศาสตราจารย์ ชัยชาญ ถาวรเวช","อธิการบดี","พ.ศ. 2562 - ปัจจุบัน")

        };
        public MyAdapter() {

        }

        @NonNull
        @Override
        public th.su.homwork.silpakornchancello.MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chancellor, parent, false);
            th.su.homwork.silpakornchancello.MyAdapter.MyViewHolder vh = new th.su.homwork.silpakornchancello.MyAdapter.MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull th.su.homwork.silpakornchancello.MyAdapter.MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.nameTextView.setText(items[position].nameTextView);
            holder.positionTextView.setText(items[position].positionTextView);
            holder.workYearTextView.setText(items[position].workYearTextView);
        }

        @Override
        public int getItemCount() {
            return items.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView nameTextView;
            TextView positionTextView;
            TextView workYearTextView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                nameTextView = itemView.findViewById(R.id.name_text_view);
                positionTextView = itemView.findViewById(R.id.position_text_view);
                workYearTextView = itemView.<TextView>findViewById(R.id.work_year_text_view);
            }
        }

    }