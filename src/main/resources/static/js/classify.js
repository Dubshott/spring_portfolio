import { initializeApp } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-app.js";
import { getDatabase, ref, set, onValue, remove } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-database.js";
import { reviewIds, classList } from "./display.js";

$(function(){
    if($('body').is('.Submission')){
        document.getElementById('review').addEventListener('submit', submitReview);
    }
});


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
const db = getDatabase();

let btn = document.createElement("button");
btn.innerHTML = "Clear";
btn.onclick = function () {
    remove(ref(db, '/'));
};
document.body.appendChild(btn);


function submitReview(e) {
    var classes = document.getElementById("classes").value;
    var difficulty = document.getElementById("difficulty").value;
    var rating = document.getElementById("rating").value;
    var teacher = document.getElementById("teacher").value;
    var written = document.getElementById("written").value;
    var reviewId = (Math.random() + 1).toString(36).substring(2);
    reviewIds.push(reviewId);
    classList.push(classes);
    console.log(reviewIds);

    e.preventDefault();
    set(ref(db, 'class/' + classes + '/' + reviewId), {
        class: classes,
        difficulty: difficulty,
        rating : rating,
        teacher : teacher,
        written : written
    });
}

