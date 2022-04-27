package com.example.catalogo_v1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import static android.widget.CompoundButton.*;

public class ProdutoFragment extends Fragment {
    Produto mProduto;
    private EditText mCampoDescricao;
    private Button mPreco;
    private Button mDataEntradaEstoque;
    private CheckBox mDisponivel;

    @Override
    public void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        mProduto = new Produto();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_produto, container, false);

        mCampoDescricao = (EditText) v.findViewById(R.id.descricao_produto);

        mCampoDescricao.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //mCampoDescricao.setText(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        mPreco = (Button) v.findViewById(R.id.preco);
        mPreco.setText(mProduto.getPreco());
        mPreco.setEnabled(false);

        mDataEntradaEstoque = (Button) v.findViewById(R.id.data_entrada_estoque);
        mDataEntradaEstoque.setText(mProduto.getDataEntradaEstoque().toString());
        mDataEntradaEstoque.setEnabled(false);

        mDisponivel = (CheckBox) v.findViewById(R.id.no_estoque);
        mDisponivel.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                mProduto.setDisponível(isChecked);
            }
        });


        return v;
    }

}
