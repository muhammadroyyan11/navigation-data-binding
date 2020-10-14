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

        return view;
    }
}