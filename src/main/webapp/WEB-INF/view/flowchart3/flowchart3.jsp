<%@page pageEncoding="UTF-8"%>
<html>
	<head>
		<title>フローチャート問題3</title>
	</head>
		<body>
		<h1>フローチャート問題3</h1>
		<h3>問題3.ランダムに入力された2桁の数字10個を昇順でソートし表示せよ。</h3>
			<c:forEach var = "m" begin="0" step ="1" end="9">
				${random[m]} &nbsp; &nbsp;
			</c:forEach>

		</body>
</html>