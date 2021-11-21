package com.deeplabstudio.deepfinance.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.deeplabstudio.deepfinance.WalletModel
import com.deeplabstudio.deepfinance.databinding.WalletRowLayoutBinding

class WalletAdapter(val walletList: ArrayList<WalletModel>) : RecyclerView.Adapter<WalletAdapter.WalletHolder>() {

    class WalletHolder(val binding: WalletRowLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletHolder {
        val binding = WalletRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WalletHolder(binding)
    }

    override fun onBindViewHolder(holder: WalletHolder, position: Int) {
        holder.binding.mCurrency.text = walletList.get(position).currency
        holder.binding.mPrice.text = walletList.get(position).price
        holder.binding.mQuantity.text = walletList.get(position).quantity.toString()
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}