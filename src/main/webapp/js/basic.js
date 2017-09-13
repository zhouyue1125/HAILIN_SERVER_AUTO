//鼠标悬浮变成手指样式
function changHand(dom){
	$(dom).css("cursor","hand");
}

function disabledInput(dom){
	$(dom).attr("disabled","disabled");
	$(dom).css({"color":"#AAAAAA"});
}


//初始化下拉列表
function initSelect(select,map){
	for(var key in map)  {
		var option = document.createElement("option");
        option.value = key;
        option.innerText = map[key];
        select.appendChild(option);
	}  
}

//创建地区邮费类
function createPostage(province,price){
	  var postage = new Object();
	  postage.province = province;
	  postage.price = price;
	  return postage;
}


//创建select控件
function createSelect(defValue,defPrice){
	var select = document.createElement("select");
	var input = document.createElement("input");
	var selectDiv = document.createElement("div");
	initSelect(select,pMap);
	selectDiv.setAttribute("class","selectDiv");
	if(defValue!="null"){
		select.value=defValue;
		input.value=defPrice;
	}
	selectDiv.appendChild(input);
	selectDiv.appendChild(select);
	$("#item_upload_layer #setPropPrice_div #body_bar #postage_are_bar").append(selectDiv);
}

//省份map
var pMap={
    	'110000':'北京市',
    	'120000':'天津市',
    	'130000':'河北省',
    	'140000':'山西省',
    	'150000':'内蒙古自治区',
    	'210000':'辽宁省',
    	'220000':'吉林省',
    	'230000':'黑龙江省',
    	'310000':'上海市',
    	'320000':'江苏省',
    	'330000':'浙江省',
    	'340000':'安徽省',
    	'350000':'福建省',
    	'360000':'江西省',
    	'370000':'山东省',
    	'410000':'河南省',
    	'420000':'湖北省',
    	'430000':'湖南省',
    	'440000':'广东省',
    	'450000':'广西壮族自治区',
    	'460000':'海南省',
    	'500000':'重庆市',
    	'510000':'四川省',
    	'520000':'贵州省',
    	'530000':'云南省',
    	'540000':'西藏自治区',
    	'610000':'陕西省',
    	'620000':'甘肃省',
    	'630000':'青海省',
    	'640000':'宁夏回族自治区',
    	'650000':'新疆维吾尔自治区',
    	'810000':'香港特别行政区',
    	'820000':'澳门特别行政区',
    	'710000':'台湾省'
};