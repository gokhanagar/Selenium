
import unittest
from testAll import TestLogin



def suite():
    suite = unittest.TestSuite()
    # Home page tests
    # Example: suite.addTest(TestCaseClass('tc_name'))
    suite.addTest(TestLogin('test_TC_L_001'))
    return suite

if __name__ == '__main__':
    runner = unittest.TextTestRunner(verbosity = 2)
    suite = suite()
    runner.run(suite)



























    