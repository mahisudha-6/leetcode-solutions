k = 4  →  ')'  →  count = -1   ❌   (one ')' too many in s[0..4])

candidates x:   x = 1  ✅  (first of its run)
                x = 3  ✅  (first of its run)
                x = 4  ❌  (same run as x = 3 → same string)

remove(s', ans, k, x, p)   →   "(())("   and   "()()("