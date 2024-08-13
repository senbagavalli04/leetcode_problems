class Solution(object):
    def isValid(self, s):
        st=[]
        for i in s:
            if i in ["{","[","("]:
                st.append(i)
            else:
                if st==[]:
                    return False
                t=st.pop()
                if t=="{":
                    if i!="}":
                        return False
                if t=="[":
                    if i!="]":
                        return False
                if t=="(":
                    if i!=")":
                        return False
        if st==[]:
            return True
        else:
            return False





        