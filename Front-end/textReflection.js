function reflectText() {
    let artifact = document.getElementById("artifact");
    let name = document.getElementById("name"); 
    let package = document.getElementById("package");
    name.value = artifact.value;
    package.value = "com.example." + artifact.value;
  }