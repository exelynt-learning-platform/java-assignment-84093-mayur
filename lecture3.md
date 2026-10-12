### Step 1: Creating a New Project Folder and Initializing the Repository

To begin tracking files, we first set up a new project directory on our computer and initialize Git inside it.

**Commands used:**
```bash
mkdir my-git-project
cd my-git-project
git init
```

**Expected terminal output:**
```text
Initialized empty Git repository in C:/Users/YourName/Documents/my-git-project/.git/
```

**Explanation:**  
Running `git init` converts an ordinary folder into an active Git repository. Git begins watching the directory and prepares to record future versions of our files.

**Everyday comparison:**  
Think of bringing home an empty storage crate. Running `git init` is like placing a digital tracking ledger inside the box, turning it into an organized locker that records every item you place inside.

---

### Step 2: Identifying and Explaining the `.git` Folder

When Git is initialized, it creates a special hidden directory named `.git` directly inside your project folder.

**How to locate it:**  
Folders that start with a period (`.`) are hidden by default to keep workspaces clean. You can display it in your terminal by adding the `-a` (all) flag:

```bash
ls -a
```

**Terminal output:**
```text
.  ..  .git
```

**What the `.git` folder does:**  
The `.git` folder serves as the central brain and database of your project. It stores:
* The complete timeline and history of every save.
* All commit snapshots and branches.
* Project configuration and author details.

**Why it stays hidden:**  
It is hidden so users do not accidentally rename, alter, or delete its contents. If this folder is removed, your normal project files remain, but your entire version history and ability to restore older drafts are lost permanently.

**A helpful mental picture:**  
Consider a live theatre show. Your project folder is the front stage where work is created and seen. The `.git` folder is the backstage control booth hidden behind the curtains—you do not touch the machinery directly, but the performance cannot run without it.

---

### Step 3: Creating a File and Checking Status with `git status`

Once the repository is initialized, we create a file and check how Git observes our workspace.

**Creating the sample file:**
```bash
echo "Hello, Git!" > index.txt
```

**Checking repository status:**
```bash
git status
```

**Expected terminal output:**
```text
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.txt

nothing added to commit but untracked files present (use "git add" to track)
```

**Explanation:**  
Running `git status` inspects your project directory and provides a clear progress report. The output indicates:
* `On branch main`: We are on the primary timeline of the project.
* `Untracked files`: Git spots that `index.txt` exists on your hard drive, but it has not yet been instructed to track or store this file.

---

### Step 4: The Three Git File States

Git does not automatically save files the instant you edit them. Instead, files move through **three distinct states**:

```text
[ Working Directory ]  ──(git add)──>  [ Staging Area ]  ──(git commit)──>  [ Git Repository ]
      (Modified)                             (Staged)                             (Committed)
```

#### 1. Modified (Working Directory)
* **What it means:** You have created or edited a file in your project folder, but it has not been marked for saving yet.
* **Current status:** The changes live only in your active local workspace.

#### 2. Staged (Staging Area)
* **What it means:** You have reviewed your work and selected specific files to be included in your upcoming save using `git add index.txt`.
* **Current status:** The files are packaged together and waiting for the final snapshot.

#### 3. Committed (Git Directory / Repository)
* **What it means:** You have finalized the milestone using `git commit -m "Add index.txt"`.
* **Current status:** The update is safely and permanently recorded inside the `.git` database with a timestamp and your author credentials.

**The grocery store analogy:**  
To picture how these three states connect, think of shopping at a supermarket:
* **Working Directory:** Walking down the aisles and picking items off the shelves. You are holding them, but you have not decided to purchase them yet.
* **Staging Area:** Placing the items into your shopping basket. You are grouping together the exact goods you intend to buy.
* **Committed:** Checking out at the cash register. The cashier stamps your receipt, and your purchase is permanently recorded in the store's system.

---
