<%@page pageEncoding="UTF-8"%>
<html>
	<head>
		<title>フローチャート問題4</title>
	</head>
		<body>
		<h1>フローチャート問題4</h1>
		<h3>問題4.入力された1～10の数字を、奇数と偶数に分けてそれぞれの合計を計算するフローチャートを考えよ。</h3>
		<h3>尚、それぞれの合計が正しい事を確認する機能を入れる事。</h3>
			<p>${message}</p>
				<p>入力値<c:forEach var = "m" begin="0" step ="1" end="10">
					 ${num[m]}
				</c:forEach></p>
			<p>偶数の合計 &nbsp; ${oSum}</p>
			<p>奇数の合計 &nbsp; ${eSum}</p>
		</body>
</html>