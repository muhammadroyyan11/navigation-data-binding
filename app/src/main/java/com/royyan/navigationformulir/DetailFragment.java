package com.royyan.navigationformulir;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.royyan.navigationformulir.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_detail, container, false);
        FragmentDetailBinding binding = FragmentDetailBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.itemNama.setText(getArguments().getString("namaMahasiswa"));
        binding.itemJk.setText(getArguments().getString("jenisKelamin"));
        binding.itemStatus.setText(getArguments().getString("statusKawin"));
        binding.itemAgama.setText(getArguments().getString("agama"));
        binding.itemKewarganegaraan.setText(getArguments().getString("kewarganegaraan"));
        binding.itemAlamatSurat.setText(getArguments().getString("alamatSurat"));
        binding.itemAsal.setText(getArguments().getString("alamatAsal"));
        binding.itemKota.setText(getArguments().getString("kota"));
        binding.itemProv.setText(getArguments().getString("provinsi"));
        binding.itemNoRumah.setText(getArguments().getString("noRumah"));
        binding.itemNoHp.setText(getArguments().getString("noHp"));
        binding.itemEmail.setText(getArguments().getString("email"));
        binding.itemNamaOrtu.setText(getArguments().getString("namaOrtu"));
        binding.itemPerguruan.setText(getArguments().getString("asalPerguruan"));
        binding.itemProdi.setText(getArguments().getString("prodi"));
        binding.itemAkreditasi.setText(getArguments().getString("akreditasi"));

        //Point B
        binding.itemPilihanA.setText(getArguments().getString("pilihanA"));
        binding.itemPilihanB.setText(getArguments().getString("pilihanB"));

        //Point C
        binding.itemAsalSekolah.setText(getArguments().getString("asalSekolah"));
        binding.itemAlamatSekolah.setText(getArguments().getString("alamatSekolah"));
        binding.itemKotaSekolah.setText(getArguments().getString("kotaSekolah"));
        binding.itemProvinsiSekolah.setText(getArguments().getString("provinsiSekolah"));
        binding.itemThnLulus.setText(getArguments().getString("tahunLulus"));
        binding.itemJmlNilai.setText(getArguments().getString("jmlNilai"));
        binding.itemJmlMapel.setText(getArguments().getString("jmlMapel"));
        binding.itemJurusanSekolah.setText(getArguments().getString("jursuanSekolah"));
        binding.itemStatusSekolah.setText(getArguments().getString("statusSekolah"));

        //Point D
        binding.itemJmlSumbangan.setText(getArguments().getString("jmlSumbangan"));

        //Point E
        binding.itemCheckMiskin.setText(getArguments().getString("TidakMampu"));
        binding.itemCheckRekom.setText(getArguments().getString("rekomendasi"));
        binding.itemCheckGaji.setText(getArguments().getString("gaji"));
        binding.itemCheckTagihan.setText(getArguments().getString("tagihan"));
        binding.itemCheckPrestasi.setText(getArguments().getString("prestasi"));
        binding.itemCheckRaport.setText(getArguments().getString("raport"));
        binding.itemCheckIjasah.setText(getArguments().getString("ijasah"));

        return view;
    }
}