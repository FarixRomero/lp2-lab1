using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class Inicio : Form
    {
        public Inicio()
        {
            InitializeComponent();
        }

        private void btnRegistro_Click(object sender, EventArgs e)
        {
            frmRegistro registronuevo=new frmRegistro();
            registronuevo.Show();
            
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            frmLogin logeo=new frmLogin();
            logeo.Show();
            
        }
    }
}
