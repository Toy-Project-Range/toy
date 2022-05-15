const postMsg = [
  "안녕하세요 출석체크 페이지입니다.",
  "꿀팁입니다.",
  "콘텐츠 추천 입니다.",
  "마케팅입니다.",
  "디자인입니다.",
  "개발입니다.",
  "HR입니다.",
  "일상입니다.",
  "유머입니다.",
];

window.addEventListener("DOMContentLoaded", function () {
  var categoryList = `<a class="list-group-item list-group-item-action bg-primary  bg-opacity-25" href="#" onclick="categoryChange(this.id)"
    name="list-item-1" id="list-item-1">📆 출석</a>`;
  categoryList += `
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-2" id="list-item-2">🍗 일상</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-3" id="list-item-3">✍ QnA</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-4" id="list-item-4">🍯 꿀팁</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-5" id="list-item-5">📝 취업정보</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-6" id="list-item-6">🌱 추천</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-7" id="list-item-7">💻 IT 뉴스</a>
    <a class="list-group-item list-group-item-action" href="#" onclick="categoryChange(this.id)"
        name="list-item-8" id="list-item-8">🎶 IT 기기추천</a>`;
  $("#list-category").empty().append(categoryList);
});

function categoryChange(tagId) {
  let target = document.getElementById(tagId);

  let idx = tagId.charAt(tagId.length - 1) - 1;
  let postContet = `<div class="m-3 mb-0">${target.innerHTML}</div>`;
  postContet += `<br><div class="ms-5">${postMsg[idx]}</div>`;
  $("#postView").empty().append(postContet);
  // $("#postView").append("<br>" + );
  console.log();
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
