package com.example.newfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NotepadActivity<adapter> extends AppCompatActivity {

    private EditText edit;
    private Button add;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);
//
//        edit = findViewById(R.id.edit);
//        add = findViewById(R.id.add);
//
//        listView = findViewById(R.id.listView);
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt_name = edit.getText().toString();
//                if (txt_name.isEmpty()){
//                    Toast.makeText(NotepadActivity.this, "No Text Entered", Toast.LENGTH_SHORT).show();
//                }else {
//                    FirebaseDatabase.getInstance().getReference().child("User_Notes").push().setValue(txt_name);
//                }
//        });
//
//        final ArrayList<String> list = new ArrayList<>();
//        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, list);
//        listView.setAdapter(adapter);
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("User_Notes")
    }
}

//
//package com.example.newfirebase;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.content.ContentResolver;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.webkit.MimeTypeMap;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
//
//public class MainActivity extends AppCompatActivity {
//
//    private Button logout;
//    private EditText edit;
//    private Button add;
//
//    private ListView listview;
//
//    private Uri imageUri;
//    private static final int IMAGE_REQUEST = 2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_notes);
//
//        logout = findViewById(R.id.logout);
//        edit = findViewById(R.id.edit);
//        add = findViewById(R.id.add);
//
//        listview = findViewById(R.id.listview);
//
//        logout.setOnClickListener((v) -> {
//            FirebaseAuth.getInstance().signOut();
//            Toast.makeText(MainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(MainActivity.this, StartActivity.class));
//        });
//
//
//////
////    //        pushing values to the real time database using edit text add button
//////
////        add.setOnClickListener(v -> {
////            String txt_name = edit.getText().toString();
////            if (txt_name.isEmpty()) {
////                Toast.makeText(MainActivity.this, "No Name Entered", Toast.LENGTH_SHORT).show();
////            } else {
//////
////    //                 Used to set values or add values to the realtime database
////                FirebaseDatabase.getInstance().getReference().child("ProgramLogDemo").child("AndroidAppDevelopment").push().setValue(txt_name);
////            }
////        });
////
//////
////    //       used to store the string values using array list
////    //       arrayadapter used to store list of values of same datatype under one single file
////        final ArrayList<String> list = new ArrayList<>();
////        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, list);
////        listview.setAdapter(adapter);
//////
////    //      used to store values to the list using add button
//////
////        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Information");
////        reference.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
////                list.clear();
////                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
////                    Information info = snapshot.getValue(Information.class);
////                    String txt = info.getName() + " : " + info.getEmail();
////                    list.add(txt);
////                }
////                adapter.notifyDataSetChanged();
////            }
////
////            @Override
////            public void onCancelled(@NonNull DatabaseError databaseError) {
////
////            }
////        });
////
//
////    // used to updating existing data
//
////        DocumentReference ref = FirebaseFirestore.getInstance().collection("Cities").document("txt");
////        ref.update("capital" , "Belfast").addOnCompleteListener(new OnCompleteListener<Void>() {
////            @Override
////            public void onComplete(@NonNull Task<Void> task) {
////                if (task.isSuccessful()){
////                    Toast.makeText(MainActivity.this, "Sucessfully updated", Toast.LENGTH_SHORT).show();
////                }
////            }
////        });
//
//
////   //          Retrieving or downloading data from cloud firestore
////
////        DocumentReference documentReference = FirebaseFirestore.getInstance().collection("States").document("Bangalore");
////        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
////            @Override
////            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
////                if(task.isSuccessful()){
////                    DocumentSnapshot doc = task.getResult();
////                    if (doc.exists()){
////                        Log.d("Document" , doc.getData().toString());
////                    }else {
////                        Log.d("Document" , "No Data");
////                    }
////                }
////            }
////        });
//
////     //       Retrieving or downloading data based on conditions from cloud firestore
////
////        FirebaseFirestore.getInstance().collection("States").whereEqualTo("capital" , true)
////                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
////            @Override
////            public void onComplete(@NonNull Task<QuerySnapshot> task) {
////                if (task.isSuccessful()){
////                    for (QueryDocumentSnapshot doc : task.getResult()){
////                        Log.d("Document" , doc.getId() + "==>" + doc.getData());
////                    }
////                }
////            }
////        });
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openImage();
//            }
//        });
//
//
//
//    }
//
//    private void openImage() {
//        Intent intent = new Intent();
//        intent.setType("image/");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivityForResult(intent , IMAGE_REQUEST);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == IMAGE_REQUEST && resultCode == RESULT_OK){
//            imageUri = data.getData();
//
//            uploadImage();
//        }
//    }
//
//    private String getFileExtension(Uri uri){
//        ContentResolver contentResolver = getContentResolver();
//
//        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
//        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
//    }
//
//    private void uploadImage() {
//
//        ProgressDialog Progress = new ProgressDialog(this);
//        Progress.setMessage("Uploading");
//        Progress.show();
//
//        if (imageUri != null){
//            StorageReference fileRef = FirebaseStorage.getInstance().getReference().child("Uploads");
//            fileRef.child(System.currentTimeMillis() +  getFileExtension(imageUri));
//            fileRef.putFile(imageUri).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
//                @Override
//                public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
//                    fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//                        @Override
//                        public void onSuccess(Uri uri) {
//                            String url = uri.toString();
//
//                            Log.d("DownloadUrl" , url);
//                            Progress.dismiss();
//                            Toast.makeText(MainActivity.this, "Sucessfully uploaded the Image", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                }
//            });
//        }
//    }
}