package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.emailSender)
        val time: TextView = itemView.findViewById(R.id.emailTime)
        val title: TextView = itemView.findViewById(R.id.emailTitle)
        val snippet: TextView = itemView.findViewById(R.id.emailSnippet)
        val avatar: TextView = itemView.findViewById(R.id.emailAvatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.sender.text = email.sender
        holder.time.text = email.time
        holder.title.text = email.title
        holder.snippet.text = email.snippet
        holder.avatar.text = email.avatar
    }

    override fun getItemCount() = emailList.size
}
