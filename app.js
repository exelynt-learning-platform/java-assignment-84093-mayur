import { createTaskElement } from "./src/components/taskList.js";

const taskInput = document.getElementById("taskInput");
const addTaskBtn = document.getElementById("addTaskBtn");
const taskList = document.getElementById("taskList");
const filterButtons = document.querySelectorAll(".filter-btn");

let currentFilter = "all";

function toggleTaskStatus(task) {
    const isCompleted = task.dataset.status === "completed";

    task.dataset.status = isCompleted ? "pending" : "completed";
    task.classList.toggle("completed", !isCompleted);
}

function addTask() {
    const taskText = taskInput.value.trim();

    if (taskText === "") {
        return;
    }

    const task = createTaskElement(taskText);
    task.dataset.status = "pending";

    task.addEventListener("click", function () {
        toggleTaskStatus(task);
        applyFilter();
    });

    taskList.appendChild(task);
    taskInput.value = "";

    applyFilter();
}

function applyFilter() {
    const tasks = taskList.querySelectorAll("li");

    tasks.forEach(function (task) {
        const status = task.dataset.status;

        if (currentFilter === "all" || currentFilter === status) {
            task.style.display = "";
        } else {
            task.style.display = "none";
        }
    });
}

addTaskBtn.addEventListener("click", addTask);

taskInput.addEventListener("keydown", function (event) {
    if (event.key === "Enter") {
        addTask();
    }
});

filterButtons.forEach(function (button) {
    button.addEventListener("click", function () {
        currentFilter = button.dataset.filter;

        filterButtons.forEach(function (btn) {
            btn.classList.remove("active");
        });

        button.classList.add("active");

        applyFilter();
    });
});
