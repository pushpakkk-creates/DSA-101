# 🔗 Linked List — Two Pointer (Slow & Fast)

---

## 🧠 PATTERN: Two Pointer (Slow & Fast)

### 💡 Core Idea

Use two pointers moving at different speeds to:

* Find middle
* Detect cycle
* Find intersection
* Locate kth node from end

---

## ⚙️ Template

```java
ListNode slow = head;
ListNode fast = head;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
```

👉 When loop ends:

* `slow` → middle or meeting point
* `fast` → null (no cycle) OR inside cycle

---

# 🚀 MUST MASTER PROBLEMS

## 🟢 1. Middle of Linked List (LC 876)

* Find middle node
* If even → second middle

💡 Use:

* Standard slow-fast template

---

## 🟡 2. Delete Middle of Linked List (LC 2095)

* Find middle using slow-fast
* Keep `prev` pointer to delete

---

## 🟢 3. Kth Node From End (GFG)

* Move fast k steps ahead
* Move both until fast reaches end

---

## 🟡 4. Remove Nth Node From End (LC 19)

* Same as Kth from end
* Use dummy node (IMPORTANT)

---

## 🟡 5. Swapping Nodes in a Linked List (LC 1721)

* Find kth from start and end
* Swap values

---

## 🟢 6. Linked List Cycle (LC 141)

* Detect if cycle exists

💡 Key Insight:

* If slow == fast → cycle present

---

## 🟡 7. Linked List Cycle II (LC 142)

* Find starting node of cycle

💡 Magic Step:
After meeting point:

```java
slow = head;
while(slow != fast){
    slow = slow.next;
    fast = fast.next;
}
```

👉 Meeting point = cycle start

---

## 🟢 8. Intersection of Two Linked Lists (LC 160)

* Two pointer trick:

```java
ListNode a = headA;
ListNode b = headB;

while(a != b){
    a = (a == null) ? headB : a.next;
    b = (b == null) ? headA : b.next;
}
```

👉 They meet at intersection OR null

---

# 🔥 EXTRA PROBLEMS USING THIS PATTERN

(from your sheet )

* Palindrome Linked List (LC 234)
* Maximum Twin Sum (LC 2130)
* Reorder List (LC 143)

---

# ⚠️ COMMON MISTAKES

❌ Forgetting `fast.next != null` → NullPointerException
❌ Losing reference of head
❌ Not using dummy node when deleting
❌ Incorrect handling of even length lists

---

# 🧠 PATTERN SUMMARY

| Use Case        | Trick              |
| --------------- | ------------------ |
| Middle          | Slow-Fast          |
| Cycle Detection | Slow meets Fast    |
| Cycle Start     | Reset slow to head |
| Kth from End    | Gap of k           |
| Intersection    | Pointer switching  |

---

# 💥 INTERVIEW INSIGHT

👉 If interviewer says:

* "Optimize space"
* "One pass solution"

⚡ Immediately think: **Two Pointer**

---

# 🏁 FINAL NOTE

Master this pattern deeply — it appears in:

* Linked List
* Arrays (two pointers)
* Sliding Window (variation)

👉 This is NOT just a trick — it's a **core thinking pattern**
