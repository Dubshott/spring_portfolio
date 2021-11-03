import { initializeApp } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-app.js";
import { getDatabase, ref, onValue } from "https://www.gstatic.com/firebasejs/9.1.3/firebase-database.js";

export var classList = [];
export var reviewIds = [];

const firebaseConfig = {
    apiKey: "AIzaSyCx0WspxX-vNcYVWlugq_PBxqzP5mDoGkY",
    authDomain: "slackbots-27d7a.firebaseapp.com",
    projectId: "slackbots-27d7a",
    storageBucket: "slackbots-27d7a.appspot.com",
    messagingSenderId: "771558378235",
    appId: "1:771558378235:web:aec85fc97f1fcbb901be5e",
    measurementId: "G-GPZT18N9PD"
};

const app = initializeApp(firebaseConfig);
const db = getDatabase();

function addElement(input) {
    var newDiv = document.createElement('div');
    var newContent = document.createTextNode(input);
    newDiv.appendChild(newContent);
    var currentDiv = document.getElementById('review');
    document.body.insertBefore(newDiv, currentDiv);
}

let btn = document.createElement("button");
btn.innerHTML = "Update Data";
btn.onclick = function () {
    displayReview();
};
document.body.appendChild(btn);


function displayReview() {
    console.log("button works");

    for (var i = 0; i < reviewIds.length; i++) {
        let tableRef = document.getElementById('datatable');
        let newRow = tableRef.insertRow();
        var num = 0;
        function addCell(input) {
            let newCell = newRow.insertCell(num);
            let newText = document.createTextNode(input);
            newCell.appendChild(newText);
            num += 1;
        }

        var dataTypes = ['difficulty', 'rating', 'teacher', 'written'];
        for (var l = 0; l < dataTypes.length; l++) {
            var reviews = ref(db, '/class/' + classList[i] + "/" + reviewIds[i] + '/' + dataTypes[l]);
            onValue(reviews, (snapshot) => {
                var data = snapshot.val();
                addCell(data);
            });


        }
    }
}