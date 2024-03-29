<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Main</title>
<meta name=viewport content="width=device-width, initial-scale=1, user-scalable=0">
<meta http-equiv="Content-Type" content="text/html; utf-8">
   <meta charset="utf-8">
   <link rel="stylesheet" href="/CSS/Inform.css">
</head>
<body>
	<!-- HEADER -->
	<%@include file="/corona/include/header.jsp"%>
	
<div id="contents-area" class="section">
   <div class="feed">
   <div class= "autor">
      <center><div class = "photo"></div></center>
      <center><div class="name">ID</div></center>
   

   </div>
         

<div id="real-area" class="section">
      <center><p>[SYSTEM] </br>
      확진자일 확률이 매우 높습니다. </br>
      예약 사이트로 이동했습니다.  </p></center>
</div>
<div class="reservation">
   <div id="map" style="height: 250px; width: 300px"></div>
   <button id="enhance">내 위치 찾기</button>

<script>

  const map = document.querySelector("#map");

  async function initMap() {
    const googleMap = new google.maps.Map(map, {
      center: { lat: 0, lng: 0 },
      zoom: 1
    });

    function onSuccess(geo) {
      const position = {
        lat: geo.coords.latitude,
        lng: geo.coords.longitude
      };
      // Reposition the map to the detected location
      googleMap.setCenter(position);
      googleMap.setZoom(12);
      // Add a marker
      new google.maps.Marker({ position, map: googleMap });
    }

    // Fetch ipdata location and update the map
    const ipdataResponse = await fetch("https://api.ipdata.co?api-key=test");
    const ipdata = await ipdataResponse.json();
    onSuccess({
      coords: {
        latitude: ipdata.latitude,
        longitude: ipdata.longitude
      }
    });

    // Listen for clicks on the "Enhance" button and use Geolocation API when clicked
    document.querySelector("#enhance").addEventListener("click", () => {
      if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(onSuccess);
      }
    });
  }
</script>
<script
  async
  defer
  src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCKGRx32IU_tJgtGea2En9kwLsAOtCmE2I&callback=initMap"
></script>
      <p></p>
    <h3 align="center">예약 달력</h3>
      <table id="calendar" border="3" align="center" style="border-color:#3333FF ">
    <tr><!-- label은 마우스로 클릭을 편하게 해줌 -->
        <td><label onclick="prevCalendar()"><</label></td>
        <td align="center" id="tbCalendarYM" colspan="5">
        yyyy년 m월</td>
        <td><label onclick="nextCalendar()">>
            
        </label></td>
    </tr>
    <tr>
        <td align="center"><font color ="#F79DC2">일</td>
        <td align="center">월</td>
        <td align="center">화</td>
        <td align="center">수</td>
        <td align="center">목</td>
        <td align="center">금</td>
        <td align="center"><font color ="skyblue">토</td>
    </tr> 
</table>
<script type="text/javascript">
        var today = new Date();
        var date = new Date();
        function prevCalendar() {
         today = new Date(today.getFullYear(), today.getMonth() - 1, today.getDate());
         buildCalendar(); 
        }
 
        function nextCalendar() {
             today = new Date(today.getFullYear(), today.getMonth() + 1, today.getDate());
             buildCalendar();
        }
        function buildCalendar(){
            var doMonth = new Date(today.getFullYear(),today.getMonth(),1);
            
            var lastDate = new Date(today.getFullYear(),today.getMonth()+1,0);
            
            var tbCalendar = document.getElementById("calendar");

            var tbCalendarYM = document.getElementById("tbCalendarYM");

             tbCalendarYM.innerHTML = today.getFullYear() + "년 " + (today.getMonth() + 1) + "월"; 
 
            while (tbCalendar.rows.length > 2) {
            
                  tbCalendar.deleteRow(tbCalendar.rows.length-1);
             
             }
             var row = null;
             row = tbCalendar.insertRow();
            
             var cnt = 0;

             for (i=0; i<doMonth.getDay(); i++) {
           
                  cell = row.insertCell();
                  cnt = cnt + 1;
             }

             for (i=1; i<=lastDate.getDate(); i++) { 
                  cell = row.insertCell();
                  cell.innerHTML = i;
                  cnt = cnt + 1;
              if (cnt % 7 == 1) {
                cell.innerHTML = "<font color=#F79DC2>" + i
            }    
              if (cnt%7 == 0){
                  cell.innerHTML = "<font color=skyblue>" + i
                   row = calendar.insertRow();
              }

              if (today.getFullYear() == date.getFullYear()
                 && today.getMonth() == date.getMonth()
                 && i == date.getDate()) {
           
                cell.bgColor = "#FAF58C";
               }
             }
        }
</script>
<script language="javascript" type="text/javascript">
    buildCalendar();
</script>

</div>

<div id="footer-area" class="section"> 

</div>
</body>
</html>