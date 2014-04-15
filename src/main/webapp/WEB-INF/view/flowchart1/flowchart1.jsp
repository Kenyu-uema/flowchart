<%@page pageEncoding="UTF-8"%>
<html>
	<head>
		<title>フローチャート問題1</title>
	</head>
		<body>
		<h1>フローチャート問題1</h1>
		<h3>問題1.箱に3種類のボールが入っています。それぞれ何個ずつ入っているか表示せよ。</h3>
			<p>${message}</p>
				<c:forEach var = "m" begin="0" step ="1" end="2">
					${m + 1} 種類目 ${count[m]}<br>
				</c:forEach>
		</body>
</html>