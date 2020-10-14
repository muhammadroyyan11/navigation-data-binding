package com.royyan.navigationformulir;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.royyan.navigationformulir.databinding.FragmentStartBinding;

public class StartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                              @Nullable ViewGroup container,
                              @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_start, container, false);
        FragmentStartBinding binding = FragmentStartBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.chkMiskin.setText("Tidak Terkumpul");
        binding.chkGaji.setText("Tidak Terkumpul");
        binding.chkTagihan.setText("Tidak Terkumpul");
        binding.chkPrestasi.setText("Tidak Terkumpul");
        binding.chkIjasah.setText("Tidak Terkumpul");
        binding.chkRekom.setText("Tidak Terkumpul");
        binding.chkFotoCopy.setText("Tidak Terkumpul");

        binding.radioGroupJenisKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                switch (checkedId1) {
                    case R.id.radioLakiLaki://radiobuttonID
                        //do what you want
                        break;
                    case R.id.radioPerempuan://radiobuttonID
                        //do what you want
                        break;
                }
            }
        });

        binding.radioGroupKewarganegaraan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                switch (checkedId1) {
                    case R.id.radioWni://radiobuttonID
                        //do what you want
                        break;
                    case R.id.radioWna://radiobuttonID
                        //do what you want
                        break;
                }
            }
        });


        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = binding.radioGroupJenisKelamin.getCheckedRadioButtonId();

                Bundle bundle = new Bundle();

                //Point A
                bundle.putString("namaMahasiswa", binding.edtNama.getText().toString());

                if(binding.radioLakiLaki.isChecked()){
                    bundle.putString("jenisKelamin", binding.radioLakiLaki.getText().toString());
                }else{
                    bundle.putString("jenisKelamin", binding.radioPerempuan.getText().toString());
                }

                bundle.putString("statusKawin", binding.spinnerStatus.getSelectedItem().toString());
                bundle.putString("agama", binding.spinnerAgama.getSelectedItem().toString());

                if(binding.radioWni.isChecked()){
                    bundle.putString("kewarganegaraan", binding.radioWni.getText().toString());
                }else{
                    bundle.putString("kewarganegaraan", binding.radioWna.getText().toString());
                }

                bundle.putString("alamatSurat", binding.edtAlamatSurat.getText().toString());
                bundle.putString("alamatAsal", binding.editTextTextPersonName3.getText().toString());
                bundle.putString("kota", binding.edtKabupaten.getText().toString());
                bundle.putString("provinsi", binding.editProvinsi.getText().toString());
                bundle.putString("noRumah", binding.editNoRumah.getText().toString());
                bundle.putString("noHp", binding.editNotelp.getText().toString());
                bundle.putString("email", binding.editEmail.getText().toString());
                bundle.putString("namaOrtu", binding.editNamaOrtu.getText().toString());
                bundle.putString("asalPerguruan", binding.editPerguruanTinggi.getText().toString());
                bundle.putString("prodi", binding.editProgramStudi.getText().toString());
                bundle.putString("akreditasi", binding.spinnerAkreditasi.getSelectedItem().toString());


                //Point B
                bundle.putString("pilihanA", binding.spinnerPilihanA.getSelectedItem().toString());
                bundle.putString("pilihanB", binding.spinnerPilihanB.getSelectedItem().toString());

                //Point C
                bundle.putString("asalSekolah", binding.editAlamatSekolah.getText().toString());
                bundle.putString("alamatSekolah", binding.editAlamatSekolah.getText().toString());
                bundle.putString("kotaSekolah", binding.editKotaSekolah.getText().toString());
                bundle.putString("provinsiSekolah", binding.editProvinsiSekolah.getText().toString());
                bundle.putString("tahunLulus", binding.editTahun.getText().toString());
                bundle.putString("jmlNilai", binding.editJmlNilai.getText().toString());
                bundle.putString("jmlMapel", binding.editMapel.getText().toString());
                bundle.putString("jurusanSekolah", binding.spinnerJurusan.getSelectedItem().toString());
                bundle.putString("statusSekolah", binding.spinnerNegeri.getSelectedItem().toString());

                //Point D
                bundle.putString("jmlSumbangan", binding.editSumbangan .getText().toString());

                //Point E

                if(binding.chkMiskin.isChecked()){
                    bundle.putString("TidakMampu", "Terkumpul");
                }else if(!binding.chkMiskin.isChecked()){
                    bundle.putString("TidakMampu", "Tidak Terkumpul");
                }else if(binding.chkRekom.isChecked()){
                    bundle.putString("rekomendasi", "Terkumpul");
                }else if(!binding.chkRekom.isChecked()){
                    bundle.putString("rekomendasi", "Tidak Terkumpul");
                }else if(binding.chkGaji.isChecked()){
                    bundle.putString("gaji", "Terkumpul");
                }else if(!binding.chkGaji.isChecked()){
                    bundle.putString("gaji", "Tidak Terkumpul");
                }else if(binding.chkTagihan.isChecked()){
                    bundle.putString("tagihan", "Terkumpul");
                }else if(!binding.chkTagihan.isChecked()){
                    bundle.putString("tagihan", "Tidak Terkumpul");
                }else if(binding.chkPrestasi.isChecked()){
                    bundle.putString("prestasi", "Terkumpul");
                }else if(!binding.chkPrestasi.isChecked()){
                    bundle.putString("prestasi", "Tidak Terkumpul");
                }else if(binding.chkFotoCopy.isChecked()){
                    bundle.putString("raport", "Terkumpul");
                }else if(!binding.chkFotoCopy.isChecked()){
                    bundle.putString("raport", "Tidak Terkumpul");
                }else if(binding.chkIjasah.isChecked()){
                    bundle.putString("ijasah", "Terkumpul");
                }else if(!binding.chkIjasah.isChecked()){
                    bundle.putString("ijasah", "Tidak Terkumpul");
                }


                Navigation.findNavController(view).navigate(R.id.detailFragment, bundle);
            }
        });

//        return binding.getRoot();
        return view;
    }
}