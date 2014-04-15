<%@page pageEncoding="UTF-8"%>
<html>
	<head>
		<title>フローチャート問題2</title>
	</head>
		<body>
		<h1>フローチャート問題2</h1>
		<h3>問題2.10進数の100を、2進数、8進数、16進数で表せ。</h3>
			<p>2進数の100は
				<c:forEach var = "m" begin="0" step ="1"  end="10">
					${count2[m]}
				</c:forEach></p>
			<p>8進数の100は
				<c:forEach var = "m" begin="0" step ="1"  end="10">
					${count8[m]}
				</c:forEach></p>
			<p>16進数の100は
				<c:forEach var = "m" begin="0" step ="1"  end="10">
					${count16[m]}
				</c:forEach></p>
</body>
</html>