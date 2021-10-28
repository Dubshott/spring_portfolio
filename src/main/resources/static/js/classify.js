//import { initializeApp } from "firebase/app";
//import { getDatabase } from "firebase/database";
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-app.js";
import { getDatabase, ref, set } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-database.js";
document.getElementById('review').addEventListener('submit', submitReview);

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyCx0WspxX-vNcYVWlugq_PBxqzP5mDoGkY",
    authDomain: "slackbots-27d7a.firebaseapp.com",
    projectId: "slackbots-27d7a",
    storageBucket: "slackbots-27d7a.appspot.com",
    messagingSenderId: "771558378235",
    appId: "1:771558378235:web:aec85fc97f1fcbb901be5e",
    measurementId: "G-GPZT18N9PD"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const database = getDatabase(app);

function submitReview(e) {
    var classes = document.getElementById("classes").value;
    var difficulty = document.getElementById("difficulty").value;
    var rating = document.getElementById("rating").value;
    var teacher = document.getElementById("teacher").value;
    var written = document.getElementById("written").value;

    console.log(difficulty);

    e.preventDefault();
    const db = getDatabase();
    set(ref(db, 'class/' + classes), {
        classes: classes,
        difficulty: difficulty,
        rating : rating,
        teacher : teacher,
        written : written,
    });


}

//import { getDatabase, ref, child, get } from "firebase/database";
//import { ref, child, get } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-database.js";

/*
const dbRef = ref(getDatabase());
get(child(dbRef)).then((snapshot) => {
    if (snapshot.exists()) {
        console.log(snapshot.val());
    } else {
        console.log("No data available");
    }
}).catch((error) => {
    console.error(error);
});
*/