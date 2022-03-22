window.addEventListener("DOMContentLoaded", function () {
  var categoryList = `<a class="list-group-item list-group-item-action bg-primary  bg-opacity-25" href="#" onclick="categoryChange(this.id)"
    name="list-item-1" id="list-item-1">💼 커리어 고민</a>`;
  categoryList += `
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-2" id="list-item-2">🍯 꿀팁</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-3" id="list-item-3">🔮 콘텐츠 추천</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-4" id="list-item-4">📣 마케팅</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-5" id="list-item-5">🎨 디자인</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-6" id="list-item-6">💻 개발</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-7" id="list-item-7">🔍 HR</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-8" id="list-item-8">🌈 일상</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-9" id="list-item-9">🎢 유머</a>`;
  $("#list-category").empty().append(categoryList);
});

function categoryChange(tagId) {
  var target = document.getElementById(tagId);

  for (let i = 1; i <= 9; i++) {
    const id = "list-item-" + i;
    var p = document.getElementById(id);
    if (id != tagId) {
      p.setAttribute("class", "list-group-item list-group-item-action");
    } else {
      target.setAttribute(
        "class",
        "list-group-item list-group-item-action bg-primary  bg-opacity-25"
      );
    }
  }
}

function enterComment() {
  alert("test");
}
